# EventSlotMapper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class EventSlotMapper<EventType extends Enum<EventType>>

Allocates integer slot indices for event observations during NPC role building. Each slot uniquely identifies a combination of event type and set identifier (e.g., a specific block set or NPC group). Also tracks the maximum observation range per slot.

## Type Parameters

- EventType | The enum type representing event categories (e.g., `BlockEventType`, `EntityEventType`).

## Fields

- eventSets | Map<EventType, IntSet> | Set IDs registered per event type.
- eventSlotMappings | Map<EventType, Int2IntMap> | Set ID to slot index mapping per event type.
- eventSlotRanges | Int2DoubleMap | Maximum observation range per slot.
- nextEventSlot | int | Counter for allocating new slots.

## Constructor


public EventSlotMapper(Class<EventType> classType, EventType[] types)

## Methods

### getEventSets


@Nonnull
public Map<EventType, IntSet> getEventSets()

### getEventSlotMappings


@Nonnull
public Map<EventType, Int2IntMap> getEventSlotMappings()

### getEventSlotRanges


@Nonnull
public Int2DoubleMap getEventSlotRanges()

### getEventSlotCount


public int getEventSlotCount()

### getEventSlot


public int getEventSlot(EventType type, int set, double maxRange)

Returns the slot for the given type and set, creating a new one if it does not exist. Updates the maximum range if the new range is larger.

## Related Types

- BuilderSupport -- owns block and entity event slot mappers
- SlotMapper -- simpler name-to-slot mapper

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public Map<EventType,IntSet> getEventSets()
  public Map<EventType,Int2IntMap> getEventSlotMappings()
  public Int2DoubleMap getEventSlotRanges()
  public int getEventSlotCount()
  public int getEventSlot(EventType type, int set, double maxRange)

Fields:
private final Map<EventType,IntSet> eventSets
private final Map<EventType,Int2IntMap> eventSlotMappings
private final Int2DoubleMap eventSlotRanges
private int nextEventSlot
