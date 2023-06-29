<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="default.aspx.cs" Inherits="StudentRegistration_Serrano_Brian.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Coding Projects</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous"/>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Student Registration</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <h1 class="my-4">Registration Form</h1>
        <form id="form1" runat="server">
            <div>
                <label for="student_id">Student ID:</label>
                <asp:TextBox ID="student_id" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="student_id"
                    ErrorMessage="Please enter Student ID" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
            </div>
            <div>
                <label for="last_name">Last Name:</label>
                <asp:TextBox ID="last_name" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="last_name"
                    ErrorMessage="Please enter Last Name" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
            </div>
            <div>
                <label for="first_name">First Name:</label>
                <asp:TextBox ID="first_name" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ControlToValidate="first_name"
                    ErrorMessage="Please enter First Name" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
            </div>
            <div>
                <label for="middle_name">Middle Name:</label>
                <asp:TextBox ID="middle_name" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" ControlToValidate="middle_name"
                    ErrorMessage="Please enter Middle Name" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
            </div>
            <div>
                <label for="age">Age:</label>
                <asp:TextBox ID="age" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator5" runat="server" ControlToValidate="age"
                    ErrorMessage="Please enter Age" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
                <asp:RangeValidator ID="RangeValidator1" runat="server" ControlToValidate="age"
                    ErrorMessage="Please enter a valid age" Type="Integer" MinimumValue="10"
                    MaximumValue="120" CssClass="text-danger" Display="Dynamic"></asp:RangeValidator>
            </div>
            <div>
                <label for="address">Address:</label>
                <asp:TextBox ID="address" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator6" runat="server" ControlToValidate="address"
                    ErrorMessage="Please enter Address" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
            </div>
            <div>
                <label for="year">Year:</label>
                <asp:TextBox ID="year" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator7" runat="server" ControlToValidate="year"
                    ErrorMessage="Please enter Year" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
                <asp:RangeValidator ID="RangeValidator2" runat="server" ControlToValidate="year"
                    ErrorMessage="Please enter a valid year" Type="Integer" MinimumValue="1900"
                    MaximumValue="2099" CssClass="text-danger" Display="Dynamic"></asp:RangeValidator>
            </div>
            <div>
                <label for="section">Section:</label>
                <asp:TextBox ID="section" runat="server" CssClass="form-control"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator8" runat="server" ControlToValidate="section"
                    ErrorMessage="Please enter Section" CssClass="text-danger" Display="Dynamic"></asp:RequiredFieldValidator>
            </div>
            <div>
                <asp:Button ID="SubmitButton" runat="server" Text="Submit" CssClass="btn btn-primary my-4" OnClick="MyButton_Click" />
            </div>
            <div>
                <asp:Label ID="error" runat="server"></asp:Label>
            </div>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>
