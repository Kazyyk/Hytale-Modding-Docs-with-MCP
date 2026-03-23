# InternalContainerUtilResource

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class InternalContainerUtilResource

Internal utility class that implements resource-based removal from item containers. Converts resource quantities to item quantities using `ItemResourceType.quantity` ratios, rounding up via `MathUtil.ceil`.

Supports all-or-nothing and exact-amount semantics.
