# SlotMapper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class SlotMapper

Maps string names to sequential integer slot indices. Used extensively by BuilderSupport to allocate named slots for flags, beacons, targets, positions, search rays, and parameters during NPC role building. Optionally tracks a reverse mapping from slot index to name.

## Constants

- NO_SLOT | int | Integer.MIN_VALUE

## Constructors


public SlotMapper()
public SlotMapper(boolean trackNames)

## Methods

### getSlot


public int getSlot(String name)

Returns the slot index for the given name, creating a new slot if the name has not been seen before.

### slotCount


public int slotCount()

Returns the total number of allocated slots.

### getSlotMappings


@Nullable
public Object2IntMap<String> getSlotMappings()

Returns the name-to-slot map, or `null` if empty.

### getNameMap


@Nullable
public Int2ObjectMap<String> getNameMap()

Returns the slot-to-name reverse map, or `null` if name tracking is disabled.

## Related Types

- ReferenceSlotMapper -- extends this with reference objects
- BuilderSupport -- uses multiple instances

Known subclasses: ReferenceSlotMapper

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 29 more)

Complete API:
  public int getSlot(String name)
  public int slotCount()
  public Object2IntMap<String> getSlotMappings()
  public Int2ObjectMap<String> getNameMap()

Fields:
public static final int NO_SLOT
private final Object2IntMap<String> mappings
private final Int2ObjectMap<String> nameMap
private int nextSlot
