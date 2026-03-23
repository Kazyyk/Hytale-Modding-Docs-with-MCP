# InternalContainerUtilMaterial

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class InternalContainerUtilMaterial

Internal utility class that implements material-based removal operations for `ItemContainer`. Materials can be identified by item ID, tag index, or resource type. Delegates to `InternalContainerUtilItemStack`, `InternalContainerUtilTag`, or `InternalContainerUtilResource` depending on the `MaterialQuantity` type.

Supports all-or-nothing and exact-amount semantics.
