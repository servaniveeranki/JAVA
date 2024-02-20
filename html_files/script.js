function submitForm() {
    // Fetch values from form
    const name = document.getElementById('name').value;
    const rollNo = document.getElementById('rollNo').value;
    const email = document.getElementById('email').value;
    const subject1 = document.getElementById('subject1').value;
    const subject2 = document.getElementById('subject2').value;
    const subject3 = document.getElementById('subject3').value;

    // Validate fields
    if (!name || !rollNo || !email || !subject1 || !subject2 || !subject3) {
        alert('All fields are required!');
        return;
    }

    // Add student information to table
    const table = document.getElementById('studentTable').getElementsByTagName('tbody')[0];
    const row = table.insertRow(table.rows.length);
    const cell1 = row.insertCell(0);
    const cell2 = row.insertCell(1);
    const cell3 = row.insertCell(2);
    const cell4 = row.insertCell(3);
    const cell5 = row.insertCell(4);
    const cell6 = row.insertCell(5);

    cell1.innerHTML = name;
    cell2.innerHTML = rollNo;
    cell3.innerHTML = email;
    cell4.innerHTML = subject1;
    cell5.innerHTML = subject2;
    cell6.innerHTML = subject3;

    // Clear form fields
    document.getElementById('name').value = '';
    document.getElementById('rollNo').value = '';
    document.getElementById('email').value = '';
    document.getElementById('subject1').value = '';
    document.getElementById('subject2').value = '';
    document.getElementById('subject3').value = '';
}

function sortElements() {
    // Fetch values from form
    const elementList = document.getElementById('elementList').value;
    const sortType = document.getElementById('sortType').value;
    const elementType = document.getElementById('elementType').value;

    // Convert comma-separated string to array
    const elementsArray = elementList.split(',');

    // Sort elements based on selected type and order
    if (elementType === 'number') {
        elementsArray.sort((a, b) => sortType === 'asc' ? a - b : b - a);
    } else if (elementType === 'string') {
        elementsArray.sort((a, b) => sortType === 'asc' ? a.localeCompare(b) : b.localeCompare(a));
    }

    // Display sorted elements
    alert(`Sorted Elements (${sortType === 'asc' ? 'Ascending' : 'Descending'}): ${elementsArray.join(', ')}`);
}
