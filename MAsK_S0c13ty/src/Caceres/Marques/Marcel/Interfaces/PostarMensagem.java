package Caceres.Marques.Marcel.Interfaces;

import Caceres.Marques.Marcel.Enums.HorarioSistema;
import Caceres.Marques.Marcel.Enums.TipoMembro;

public interface PostarMensagem  {

    String Post(TipoMembro mem, HorarioSistema hor, String msg);
}
