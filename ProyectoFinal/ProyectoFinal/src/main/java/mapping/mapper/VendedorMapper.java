package mapping.mapper;

import mapping.dto.VendedorDto;
import model.Vendedor;

public class VendedorMapper {
    public static VendedorDto toDto(Vendedor vendedor) {
        if (vendedor == null) return null;
        return new VendedorDto(
                vendedor.getNombre(),
                vendedor.getApellidos(),
                vendedor.getCedula(),
                vendedor.getDireccion(),
                vendedor.getMuroVendedor() );
    }

    // Convierte de VendedorDto a Vendedor
    public static Vendedor toEntity(VendedorDto vendedorDto) {
        if (vendedorDto == null) return null;
        return new Vendedor(
                vendedorDto.nombre(),
                vendedorDto.apellidos(),
                vendedorDto.cedula(),
                vendedorDto.direccion(),
                vendedorDto.muroVendedor()  );
    }
}
