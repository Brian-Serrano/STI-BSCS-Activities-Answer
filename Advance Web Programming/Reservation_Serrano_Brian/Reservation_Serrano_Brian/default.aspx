<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="default.aspx.cs" Inherits="Reservation_Serrano_Brian._default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Reservation Form</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous"/>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Reservation Form</a>
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
        <h1 class="my-4">Reservation Form</h1>
        <form id="form1" runat="server">
            <div class="row my-4">
                <div class="col-md-6">
                    <label for="full_name">Full Name:</label>
                    <asp:TextBox ID="full_name" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
                <div class="col-md-6">
                    <label for="address">Address:</label>
                    <asp:TextBox ID="address" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
            </div>
            <div class="row my-4">
                <div class="col-md-6">
                    <label for="id_type">ID Type:</label>
                    <asp:TextBox ID="id_type" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
                <div class="col-md-6">
                    <label for="id_number">ID Number:</label>
                    <asp:TextBox ID="id_number" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
            </div>
            <div class="row my-4">
                <div class="col-md-6">
                    <label for="room_number">Room Number:</label>
                    <asp:TextBox ID="room_number" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
                <div class="col-md-6">
                    <label for="in_out">Date in and Date out:</label>
                    <asp:TextBox ID="in_out" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
            </div>
            <div class="row my-4">
                <div class="col-md-6">
                    <label for="rate">Rate/Period:</label>
                    <asp:TextBox ID="rate" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
                <div class="col-md-6">
                    <label for="charges">Total Charges:</label>
                    <asp:TextBox ID="charges" runat="server" CssClass="form-control"></asp:TextBox>
                </div>
            </div>
            <div class="row my-4">
                <div class="col-md-6">
                    <asp:Button ID="Checkout" runat="server" Text="Check Out" CssClass="btn btn-primary my-4" OnClick="Checkout_Click" />
                </div>
                <div class="col-md-6">
                    <asp:Button ID="Cancel" runat="server" Text="Cancel" CssClass="btn btn-primary my-4" OnClick="Cancel_Click" />
                </div>
            </div>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>