$(document).ready(function () {
    listar();
});
function listar() {
    $.ajax({
        url: "/persona/all",
        type: 'GET',
        success: function (x) {
            console.log(x);
            $("#table tbody tr").remove();
            x.forEach((item, index, array) => {
                $("#table").append(
                        "<tr>\n\
                            <td>" + (index + 1) + "</td>\n\
                            <td>" + item.persApPaterno + " " + item.persApMaterno + "</td>\n\
                            <td>" + item.persNombres + "</td>\n\
                            <td>" + item.persDni + "</td>\n\
                            <td>" + item.persCoElect + "</td>\n\
                            <td>" + item.persDirec + "</td>\n\
                            \n\<td>" + item.persEd + "</td>\n\
                            \n\<td>" + item.persGe + "</td>\n\
                            <td>" + item.persTelefono + "</td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='editar(" + item.persId + ")'><i class='fa-solid fa-pen-to-square yelow'></i></a>\n\
                            </td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='eliminar(" + item.persId + ")'><i class='fa-solid fa-trash-can red'></i></a>\n\
                            </td>\n\
                        </tr>");

            });
        }
    });
}


           
   


$("#nuevo").click(function () {
    listarTipoDocumento(0);
});
 
function editar(id) {
    $.ajax({
        url: "/persona/" + id,
        type: 'GET',
        success: function (w) {
            $("#edit_persId").val(w.persId);
            $("#edit_apPaterno").val(w.persApPaterno);
            $("#edit_apMaterno").val(w.persApMaterno);
            $("#edit_nombres").val(w.persNombres);
            $("#edit_dni").val(w.persDni);
            $("#edit_CoElect").val(w.persCoElect);
             $("#edit_Direc").val(w.persDirec);
            $("#edit_Ed").val(w.persEd);
             $("#edit_Ge").val(w.persGe);
            $("#edit_telefono").val(w.persTelefono);
           
        }
    });
    $("#editarModal").modal('show');
}
function eliminar(id) {
    bootbox.confirm({
        message: "¿Está seguro que desea eliminar el registro?",
        closeButton: false,
        title: "Eliminar",
        buttons: {
            confirm: {
                label: 'Eliminar',
                className: 'btn-primary'
            },
            cancel: {
                label: 'Cancelar',
                className: 'btn-danger'
            }
        },
        callback: function (result) {
            if (result) {
                $.ajax({
                    url: "/persona/" + id,
                    type: 'DELETE',
                    success: function (w) {
                        var dialog = bootbox.dialog({
                            message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Eliminado Correctamente.</p>',
                            closeButton: false
                        });
                        setTimeout(function () {
                            dialog.modal('hide');
                        }, 1500);
                        listar();
                    }
                });
            } else {
                var dialog = bootbox.dialog({
                    message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro no Eliminado.</p>',
                    closeButton: false
                });
                setTimeout(function () {
                    dialog.modal('hide');
                }, 1500);
            }
        }
    });
}
$("#guardar").click(function () {
    $.ajax({
        url: "/persona/save",
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            persApPaterno: $("#apPaterno").val(),
            persApMaterno: $("#apMaterno").val(),
            persNombres: $("#nombres").val(),
            persDni: $("#Dni").val(),
            persCoElect: $("#CoElect").val(),
            persDirec: $("#Direc").val(),
            persEd: $("#Ed").val(),
            persGe: $("#Ge").val(),
            persTelefono: $("#telefono").val(),
            persEstado: true,
           
        }),
        cache: false,
        success: function (w) {
            var dialog = bootbox.dialog({
                message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Guardado Correctamente.</p>',
                closeButton: false
            });
            setTimeout(function () {
                dialog.modal('hide');
            }, 1500);
            limpiar();
            listar();
        }
    });
    $("#exampleModal").modal('hide');
});
function limpiar() {
    $("#apPaterno").val('');
    $("#apMaterno").val('');
    $("#nombres").val('');
    $("#dni").val('');
    $("CoElect").val('');
    $("Direc").val('');
    $("Ed").val('');
    $("Ge").val('');
    $("#telefono").val('');
}

$("#modificar").click(function () {
    $.ajax({
        url: "/persona/update",
        type: 'PUT',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            persId: $("#edit_persId").val(),
            persApPaterno: $("#edit_apPaterno").val(),
            persApMaterno: $("#edit_apMaterno").val(),
            persNombres: $("#edit_nombres").val(),
            persDni: $("#edit_dni").val(),
            persCoElect: $("#edit_CoElect").val(),
            persDirec: $("#edit_Direc").val(),
            persEd: $("#edit_Ed").val(),
            persGe: $("#edit_Ge").val(),
            persTelefono: $("#edit_telefono").val(),
            
            
        }),
        cache: false,
        success: function (w) {
            var dialog = bootbox.dialog({
                message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Modificado Correctamente.</p>',
                closeButton: false
            });
            setTimeout(function () {
                dialog.modal('hide');
            }, 1500);
            listar();
        }
    });
    $("#editarModal").modal('hide');
});
