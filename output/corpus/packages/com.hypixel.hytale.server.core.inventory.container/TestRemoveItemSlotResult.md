# TestRemoveItemSlotResult

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class TestRemoveItemSlotResult

Accumulates the result of a dry-run item removal test. Records which slots were "picked" and how much quantity remains to be fulfilled.

Used internally by `InternalContainerUtilItemStack`, `InternalContainerUtilMaterial`, `InternalContainerUtilResource`, and `InternalContainerUtilTag` to verify that a removal can succeed before committing changes.

## Fields

- Map<Short, Integer> picked
- int quantityRemaining

## Constructors


public TestRemoveItemSlotResult(int testQuantityRemaining)

Creates a result with the given initial remaining quantity.

## Methods


public boolean hasResult()

Returns `true` if at least one slot was picked.


public Set<Short> getPickedSlots()

Returns the set of slot indices that contributed to the removal.
