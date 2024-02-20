import socket
import threading

def handle_client(client_socket, address):
    print(f"Accepted connection from {address}")

    while True:
        # Receive data from the client
        data = client_socket.recv(1024).decode("utf-8")

        if not data:
            break

        print(f"Received message from {address}: {data}")

        # Send the received message back to the client
        client_socket.sendall(data.encode("utf-8"))

    print(f"Connection from {address} closed")
    client_socket.close()

def start_server():
    server_ip = "127.0.0.1"
    server_port = 5555

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind((server_ip, server_port))
    server_socket.listen(5)

    print(f"Server listening on {server_ip}:{server_port}")

    while True:
        client_socket, address = server_socket.accept()
        client_handler = threading.Thread(target=handle_client, args=(client_socket, address))
        client_handler.start()

if __name__ == "__main__":
    start_server()
