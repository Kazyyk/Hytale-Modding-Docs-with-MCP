# InternalContainerUtilItemStack

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class InternalContainerUtilItemStack

Internal utility class that implements the core item-stack-based add, remove, and test operations for `ItemContainer`. All methods operate under the container's write lock (called by the container's `writeAction` methods).

Handles stacking logic, all-or-nothing semantics, filter checks, and quantity splitting across slots.

Not intended for direct use -- called by `ItemContainer` public methods.
