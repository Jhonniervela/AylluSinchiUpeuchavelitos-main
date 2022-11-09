/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
$(document).ready(function () {
    listar();
});
function listar() {
    $.ajax({url: "/RegistroAsist/all",
        type: 'GET',
        success: function (x) {
            $("#table tbody tr").remove();
            x.forEach((item, index, array) => {
                $("#table").append(
                        "<tr>\n\
                            <td>" + (index + 1) + "</td>\n\
                            <td>" + item.nombre + "</td>\n\
\n\                        <td>" + item.fecha + "</td>\n\
\n\                        <td>" + item.hora + "</td>\n\
\n                      <td>" + item.descripcion + "</td>\n\
                         <td>" + item.lugar + "</td>\n\
\n\                      <td>" + item.direccion + "</td>\n\
\n\                          <td>" + item.programa + "</td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='editar(" + item.regisId + ")'><i class='fa-solid fa-pen-to-square yelow'></i></a>\n\
                            </td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='eliminar(" + item.regisId + ")'><i class='fa-solid fa-trash-can red'></i></a>\n\
                            </td>\n\
                        </tr>");

            });
        }
    });
}

