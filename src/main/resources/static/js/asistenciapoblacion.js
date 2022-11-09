$(document).ready(function () {
    listar();
});
function listar() {
    $.ajax({
        url: "/poblacionAsistencia/all",
        type: 'GET',
        success: function (x) {
            $("#table tbody tr").remove();
            x.forEach((item, index, array) => {
                $("#table").append(
                        "<tr>\n\
                            <td>" + (index + 1) + "</td>\n\
                            <td>" + item.aspoApPaterno + " " + item.aspoApMaterno + "</td>\n\
                            <td>" + item.aspoNombres + "</td>\n\
                            <td>" + item.aspoDni + "</td>\n\
                            <td>" + item.aspoEdad + "</td>\n\
                            <td>" + item.aspoDireccion + "</td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='editar(" + item.aspoId + ")'><i class='fa-solid fa-pen-to-square yelow'></i></a>\n\
                            </td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='eliminar(" + item.aspoId + ")'><i class='fa-solid fa-trash-can red'></i></a>\n\
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
        url: "/poblacionAsistencia/" + id,
        type: 'GET',
        success: function (w) {
            $("#edit_aspoId").val(w.aspoId);
            $("#edit_apPaterno").val(w.aspoApPaterno);
            $("#edit_apMaterno").val(w.aspoApMaterno);
            $("#edit_nombres").val(w.aspoNombres);
            $("#edit_dni").val(w.aspoDni);
            $("#edit_edad").val(w.aspoEdad);
            $("#edit_direccion").val(w.aspoDireccion);
           
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
        url: "/poblacionAsistencia/save",
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            aspoApPaterno: $("#apPaterno").val(),
            aspoApMaterno: $("#apMaterno").val(),
            aspoNombres: $("#nombres").val(),
            aspoDni: $("#dni").val(),
            aspoDireccion: $("#direccion").val(),
            aspoEdad: $("#edad").val(),
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
    $("#Nombres").val('');
    $("#DNI").val('');
    $("#Edad").val('');
    $("#Direccion").val('');
}

$("#modificar").click(function () {
    $.ajax({
        url: "/poblacionAsistencia/update",
        type: 'PUT',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            aspoId: $("#edit_persId").val(),
            aspoApPaterno: $("#edit_apPaterno").val(),
            aspoApMaterno: $("#edit_apMaterno").val(),
            aspoNombres: $("#edit_nombres").val(),
            aspoDni: $("#edit_eNI").val(),
            aspoEdad: $("#edit_edad").val(),
            aspoDireccion: $("#edit_direccion").val(),
            
            
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
