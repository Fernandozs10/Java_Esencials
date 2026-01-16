package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("Iniciando ventas");
        var producto1 = new Producto("Blusa", 30);
        System.out.println("Producto 1: " + producto1.toString());
        var producto2 = new Producto("Zapatos", 40);
        System.out.println("Producto 2: " + producto2.toString());
        var producto3 = new Producto("polos", 50);
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        System.out.println(orden1);
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 30));
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        System.out.println(orden2);
    }
}
