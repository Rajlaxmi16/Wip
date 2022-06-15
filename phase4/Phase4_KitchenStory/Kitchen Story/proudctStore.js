let btnGet = document.querySelector('button');
let myTable = document.querySelector('#table');

let employees = [
    { pId: 'SN412', pName: 'Muesli Fruit Magic', pPrice: 'Rs.355', pBrand: 'Kellogg\'s', pCategory: 'Snacks', pEdit: 'Edit', pDlt: 'Delete'}
//     { name: 'Rony', age: 31, country: 'United Kingdom' },
//     { name: 'Peter', age: 58, country: 'Canada' },
//     { name: 'Marks', age: 20, country: 'Spain' }
]
let headers = ['Product Id', 'Product Name', 'Product Price', 'Product Brand', 'Product Category'];
btnGet.addEventListener('click', () => {
    let table = document.createElement('table');
    let headerRow = document.createElement('tr');
    headers.forEach(headerText => {
        let header = document.createElement('th');
        let textNode = document.createTextNode(headerText);
        header.appendChild(textNode);
        headerRow.appendChild(header);
    });
    table.appendChild(headerRow);
    employees.forEach(emp => {
        let row = document.createElement('tr');
        Object.values(emp).forEach(text => {
            let cell = document.createElement('td');
            let textNode = document.createTextNode(text);
            cell.appendChild(textNode);
            row.appendChild(cell);
        })
        table.appendChild(row);
    });
    myTable.appendChild(table);
});

let anchor=document.createElement("a");
anchor.href="_anylinkthatyouwanttoadd_";
anchor.onclick="onDelete(this)"
anchor.innerText="Delete";//optional
console.log(anchor)
let to_add=document.getElementById("#table")
to_add.appendChild(anchor)

function onDelete(td) {
    if (confirm('Are you sure to delete this record ?')) {
        row = td.parentElement.parentElement;
        document.getElementById("productList").deleteRow(row.rowIndex);
        resetForm();
    }
}