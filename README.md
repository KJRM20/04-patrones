
# Patron Command
Command es un patrón de comportamiento que busca encapsular una solicitud en un objeto independiente, lo que permite:
- Parametrizar métodos.
- Retrasar su ejecución.
- Deshacer operaciones.
- Almacenar un historial de acciones.


## Funcionamiento

Imagina que tienes un conjunto de operaciones que deben ejecutarse, pero quieres encapsular cada una de ellas como un objeto independiente. Este enfoque te permite almacenar, deshacer o incluso ejecutar estas operaciones en un orden específico, según sea necesario.

El patrón Command te ayuda a desacoplar al emisor de comandos del receptor, permitiendo que cada comando encapsule toda la información requerida para realizar una acción. Esto lo hace ideal para implementar funciones como deshacer/rehacer en aplicaciones complejas o para manejar solicitudes en sistemas donde las acciones pueden ejecutarse en momentos distintos o incluso por diferentes componentes.

## Cuando usarlo...
- Si quieres que un botón o un menú ejecute una acción, pero sin que sepa cómo hacerlo, este patrón es ideal porque separa la solicitud (el botón) de la ejecución (el objeto que realiza la acción).
- Si necesitas implementar una cola de comandos, puedes usar este patrón para almacenarlos y ejecutarlos posteriormente.
- Si tu aplicación necesita permitir a los usuarios revertir acciones, el patrón Command es ideal, ya que cada comando puede almacenar información suficiente para deshacer o rehacer la acción realizada.




