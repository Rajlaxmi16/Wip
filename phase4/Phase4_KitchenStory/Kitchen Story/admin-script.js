var selectedRow = null

/* ---------------------------------------- SUBMIT PRODUCT FORM ------------------------------------------------- */
function onFormSubmit() {
    if (validate()) {
        var formData = readFormData();
        if (selectedRow == null)
            insertNewRecord(formData);
        else
            updateRecord(formData);
        resetForm();
    }
}

/* ---------------------------------------- FETCH FORM DATA ------------------------------------------------- */
function readFormData() {
    var formData = {};
    formData["pId"] = document.getElementById("pId").value;
    formData["pName"] = document.getElementById("pName").value;
    formData["pPrice"] = document.getElementById("pPrice").value;
    formData["pBrand"] = document.getElementById("pBrand").value;
    formData["pCategory"] = document.getElementById("pCategory").value;
    return formData;
}

/* ---------------------------------------- INSERT NEW PRODUCT ------------------------------------------------- */
function insertNewRecord(data) {
    var table = document.getElementById("productList").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);
    cell1 = newRow.insertCell(0);
    cell1.innerHTML = data.pId;
    cell2 = newRow.insertCell(1);
    cell2.innerHTML = data.pName;
    cell3 = newRow.insertCell(2);
    cell3.innerHTML = data.pPrice;
    cell4 = newRow.insertCell(3);
    cell4.innerHTML = data.pBrand;
    cell5 = newRow.insertCell(4);
    cell5.innerHTML = data.pCategory;
    cell6 = newRow.insertCell(5);
    cell6.innerHTML = `<a onClick="onEdit(this)">Edit</a>
                       <a onClick="onDelete(this)">Delete</a>`;
}

/* ---------------------------------------- FORM RESET ------------------------------------------------- */
function resetForm() {
    document.getElementById("pId").value = "";
    document.getElementById("pName").value = "";
    document.getElementById("pPrice").value = "";
    document.getElementById("pBrand").value = "";
    document.getElementById("pCategory").value = "";
    selectedRow = null;
}

/* ---------------------------------------- EDIT PRODUCT DETAILS ------------------------------------------------- */
function onEdit(td) {
    selectedRow = td.parentElement.parentElement;
    document.getElementById("pId").value = selectedRow.cells[0].innerHTML;
    document.getElementById("pName").value = selectedRow.cells[1].innerHTML;
    document.getElementById("pPrice").value = selectedRow.cells[2].innerHTML;
    document.getElementById("pBrand").value = selectedRow.cells[3].innerHTML;
    document.getElementById("pCategory").value = selectedRow.cells[4].innerHTML;
}

/* ---------------------------------------- UPDATE PRODUCT LIST ------------------------------------------------- */
function updateRecord(formData) {
    selectedRow.cells[0].innerHTML = formData.pId;
    selectedRow.cells[1].innerHTML = formData.pName;
    selectedRow.cells[2].innerHTML = formData.pPrice;
    selectedRow.cells[3].innerHTML = formData.pBrand;
    selectedRow.cells[4].innerHTML = formData.pCategory;
}

/* ---------------------------------------- DELETE ITEM ------------------------------------------------- */
function onDelete(td) {
    if (confirm('Are you sure to delete this record ?')) {
        row = td.parentElement.parentElement;
        document.getElementById("productList").deleteRow(row.rowIndex);
        resetForm();
    }
}

/* ---------------------------------------- VALIDATE PRODUCT FORM ------------------------------------------------- */
function validate() {
    isValid = true;
    if (document.getElementById("pId").value == "") {
        isValid = false;
        document.getElementById("pIdValidationError").classList.remove("hide");
    } else {
        isValid = true;
        if (!document.getElementById("pIdValidationError").classList.contains("hide"))
            document.getElementById("pIdValidationError").classList.add("hide");
    }
    return isValid;
}

/* ---------------------------------------- CHANGE PASSWORD ------------------------------------------------- */
function onSubmitClick() {
    var flag = true;
    if(document.getElementById('oldPass').value == "" || document.getElementById('newPass').value == "" || document.getElementById('confirmPass').value =="")
    {
        alert("Fields cannot be empty")
        document.getElementById("passForm").reset();
        flag = false;
        return false;
    }

    if(flag == true)
        checkConfirmPass();
}

function checkConfirmPass()
{
    var flag = true;
    if(document.getElementById('oldPass').value == document.getElementById('newPass').value)
    {
        alert('New password cannot be same as old password !!')
        document.getElementById("passForm").reset();
        flag = false;
        return false;
    }
    else if(document.getElementById('newPass').value != document.getElementById('confirmPass').value)
    {
        alert('Passwords entered do not match !!')
        document.getElementById("passForm").reset();
        flag = false;
        return false;
    }
    if(flag == true)
        checkChangePass();
}

function checkChangePass(){
    if (confirm('Are you sure to change the password ?')) {
        alert('Password changed successfully !!')
        document.getElementById("passForm").reset();
    }
}

/* ---------------------------------------- LOGIN FUNCTION ------------------------------------------------- */
function onLogin()
{
    var storedName = "admin@gmail.com";
    var storedPass = "1234";
    // storedPass = document.getElementById('newPass').value;

    var username = document.getElementById("username").value;
    var password = document.getElementById("pass").value;
    if ( username == storedName && password == storedPass)
    {
    alert ("Login successfull");
    window.location = "admin-index.html"; // Redirecting to other page.
    return false;
    }
}

/* ---------------------------------------- SEARCH FUNCTION ------------------------------------------------- */
const searchFun = () =>{
    let filter = document.getElementById('myInput').value.toUpperCase();
    let myTables = document.getElementById('productList');
    let tr = myTables.getElementsByTagName('tr');

    for(var i=0; i<tr.length; i++)
    {
        let td = tr[i].getElementsByTagName('td')[4];

        if(td)
        {
            let textvalue = td.textContent || td.innerHTML;

            if(textvalue.toUpperCase().indexOf(filter) > -1)
            {
                tr[i].style.display = ""
            }
            else{
                tr[i].style.display = "none";
            }
        }
    }
}