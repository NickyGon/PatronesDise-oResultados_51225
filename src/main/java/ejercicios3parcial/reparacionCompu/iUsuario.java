package ejercicios3parcial.reparacionCompu;

import observer.ejercicio.ClienteRegistrado;

public interface iUsuario {
    void notify(String message);
    UsuarioRegistrado.Cargos getCargo();
}
