import socket
import threading

def receive_messages(client_socket):
    while True:
        # Receive data from the server
        data = client_socket.recv(1024).decode("utf-8")
        print(f"Received from server: {data}")

def start_client():
    server_ip = "127.0.0.1"
    server_port = 5555

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((server_ip, server_port))

    print("Connected to the server. You can start typing messages.")

    # Start a thread to receive messages from the server
    receive_thread = threading.Thread(target=receive_messages, args=(client_socket,))
    receive_thread.start()

    # Main loop to send messages to the server
    while True:
        message = input("You: ")
        client_socket.sendall(message.encode("utf-8"))

if __name__ == "__main__":
    start_client()
