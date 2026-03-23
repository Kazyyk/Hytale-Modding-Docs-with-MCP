# ReferenceSlotMapper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: SlotMapper

public class ReferenceSlotMapper<T> extends SlotMapper

Extends SlotMapper to associate each slot with a lazily-created reference object. When a slot is requested, if it does not already have an associated object, one is created via the provided `Supplier<T>`. Used by BuilderSupport for timer slots.

## Type Parameters

- T | The reference object type (e.g., `Timer`).

## Constructors


public ReferenceSlotMapper(Supplier<T> slotSupplier)
public ReferenceSlotMapper(Supplier<T> slotSupplier, boolean trackNames)

## Methods

### getReference


public T getReference(String name)

Returns the reference object for the named slot, creating it on first access.

### getReferenceList


public List<T> getReferenceList()

Returns the list of all created reference objects.

## Related Types

- SlotMapper -- parent class
- BuilderSupport -- uses this for timer allocation
