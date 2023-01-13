<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <title>Final Exam</title>

    <body>
    <div>Data Consume</div>
    <hr />
    <script>
      //const url = "http://localhost:8083";
      //get data from server
      function get() {
        $.ajax({
          url: "http://localhost:8083/GET",
          method: "GET",
          dataType: "json",
          success: function (data) {
            //start function
            $("#mytable").find("tbody").empty(); //for empty table if data exists
            $.each(data, function (key, value) {
              //fill data to table
              var td =
                "<tr><td>" +
                value.id +
                "</td> <td>" +
                value.noSurat +
                "</td> <td>" +
                value.judul +
                "</td></td>" +
                value.tembusan +
                "</td> <td>" +
                value.file +
                "</td> <td>" +
                value.timestamp +
                "</td></tr>";
              $("#mytable").find("tbody").append(td);
            });
          } //end function
        });
      }
      //create new data
      function post() {
        let id = document.getElementById("id").value;
        let noSurat = document.getElementById("noSurat").value;
        let judul = document.getElementById("judul").value;
        let tembusan = document.getElementById("tembusan").value;
        let file = document.getElementById("file").value;
        let timestamp = document.getElementById("timestamp").value;
        let dataText = { id: id, noSurat: noSurat, judul: judul, tembusan: tembusan, file: file, timestamp: timestamp };
        let dataJson = JSON.stringify(dataText);
        $.ajax({
          url: "http://localhost:8083/POST",
          method: "POST",
          data: dataJson,
          contentType: "application/json",
          dataType: "text",
          success: function (result) {
            get();
          },
        });
      }
      function put() {
        let id = document.getElementById("id").value;
        let noSurat = document.getElementById("noSurat").value;
        let judul = document.getElementById("judul").value;
        let tembusan = document.getElementById("tembusan").value;
        let file = document.getElementById("file").value;
        let timestamp = document.getElementById("timestamp").value;
        let dataText = { id: id, noSurat: noSurat, judul: judul, tembusan: tembusan, file: file, timestamp: timestamp };
        let dataJson = JSON.stringify(dataText);
        $.ajax({
          url: "http://localhost:8083/PUT",
          method: "PUT",
          data: dataJson,
          contentType: "application/json",
          dataType: "text",
          success: function (result) {
            get();
          }
        });
      }
      function delID() {
        let id = document.getElementById("id").value;
        let dataText = { id: id };
        let dataJson = JSON.stringify(dataText);
        $.ajax({
          url: "http://localhost:8083/DELETE",
          method: "DELETE",
          data: dataJson,   
          contentType: "application/json",
          dataType: "text",
          success: function (result) {
            get();
          }
        });
      }
    </script>
    <table>
      <tr>
        <td>ID</td>
        <td>:</td>
        <td><input type="text" id="id" name="id" /></td>
        <td><button onclick="get()">GET</button></td>
      </tr>
      <tr>
        <td>NO Surat</td>
        <td>:</td>
        <td><input type="text" id="noSurat" name="noSurat" /></td>
        <td><button onclick="post()">INSERT</button></td>
      </tr>
      <tr>
        <td>Judul</td>
        <td>:</td>
        <td><input type="text" id="judul" name="judul" /></td>
        <td><button onclick="put()">UPDATE</button></td>
      </tr>
      <tr>
        <td>Tembusan</td>
        <td>:</td>
        <td><input type="text" id="tembusan" name="tembusan" /></td>
        <td><button onclick="delID()">DELETE</button></td>
      </tr>
      <tr>
        <td>File</td>
        <td>:</td>
        <td><input type="text" id="file" name="file" /></td>
       </tr>
       <tr>
        <td>Timestamp</td>
        <td>:</td>
        <td><input type="text" id="timestamp" name="timestamp" /></td>
       </tr>
    </table>
    <hr />
    <br />
    <table id="mytable" border="1">
      <thead>
        <tr>
          <th>ID</th>
          <th>NO Surat</th>
          <th>Judul</th>
          <th>Tembusan</th>
          <th>File</th>
          <th>Timestamp</th>
        </tr>
      </thead>
      <tbody></tbody>
    </table>
  </body>

<?php

include('koneksi.php');
{

}?>

</html>