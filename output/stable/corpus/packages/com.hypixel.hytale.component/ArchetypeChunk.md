# ArchetypeChunk

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object

public class ArchetypeChunk<ECS_TYPE>

Columnar storage for entities that share the same Archetype. Components are stored in parallel arrays indexed by entity position within the chunk, enabling cache-friendly iteration. Each chunk holds a `Ref` array and a 2D component array (`Component[componentTypeIndex][entityIndex]`).

ArchetypeChunk is the core data structure that makes the ECS iteration efficient -- systems iterate over contiguous arrays rather than following pointers.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Constructor


public ArchetypeChunk(@Nonnull Store<ECS_TYPE> store, @Nonnull Archetype<ECS_TYPE> archetype)

## Methods


@Nonnull
public Archetype<ECS_TYPE> getArchetype()


public int size()

Returns the number of entities in this chunk.


@Nonnull
public Ref<ECS_TYPE> getReferenceTo(int index)

Returns the entity reference at the given index.


@Nullable
public <T extends Component<ECS_TYPE>> T getComponent(int index, @Nonnull ComponentType<ECS_TYPE, T> componentType)

Returns the component for entity at `index`, or `null` if the archetype does not include that component type.


public <T extends Component<ECS_TYPE>> void setComponent(int index, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)

Replaces the component for entity at `index`.


public int addEntity(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Holder<ECS_TYPE> holder)

Adds an entity's data from a Holder. Returns the entity's index within this chunk.


@Nonnull
public Holder<ECS_TYPE> removeEntity(int entityIndex, @Nonnull Holder<ECS_TYPE> target)

Removes entity at `entityIndex`, copying its data into the target Holder. Uses swap-remove for O(1) removal.


@Nonnull
public Holder<ECS_TYPE> copyEntity(int entityIndex, @Nonnull Holder<ECS_TYPE> target)

Deep-copies entity data into the target Holder without removing the entity.


public void transferTo(@Nonnull Holder<ECS_TYPE> tempHolder, @Nonnull ArchetypeChunk<ECS_TYPE> chunk, @Nonnull Consumer<Holder<ECS_TYPE>> modification, @Nonnull IntObjectConsumer<Ref<ECS_TYPE>> referenceConsumer)

Transfers all entities to another chunk, applying a modification to each entity's holder during transfer. Used during archetype migration.

## Related Types

- Archetype -- defines which component types this chunk stores
- Store -- owns and manages archetype chunks
- Ref -- identifies entities within the chunk

Also in this package: AddReason, Archetype, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  public static ArchetypeChunk<ECS_TYPE>[] emptyArray()
  public Archetype<ECS_TYPE> getArchetype()
  public int size()
  public Ref<ECS_TYPE> getReferenceTo(int index)
  public void setComponent(int index, ComponentType<ECS_TYPE,T> componentType, T component)
  public T getComponent(int index, ComponentType<ECS_TYPE,T> componentType)
  public int addEntity(Ref<ECS_TYPE> ref, Holder<ECS_TYPE> holder)
  public Holder<ECS_TYPE> copyEntity(int entityIndex, Holder<ECS_TYPE> target)
  public Holder<ECS_TYPE> copySerializableEntity(ComponentRegistry.Data<ECS_TYPE> data, int entityIndex, Holder<ECS_TYPE> target)
  public Holder<ECS_TYPE> removeEntity(int entityIndex, Holder<ECS_TYPE> target)
  public void transferTo(Holder<ECS_TYPE> tempInternalEntityHolder, ArchetypeChunk<ECS_TYPE> chunk, Consumer<Holder<ECS_TYPE>> modification, IntObjectConsumer<Ref<ECS_TYPE>> referenceConsumer)
  public void transferSomeTo(Holder<ECS_TYPE> tempInternalEntityHolder, ArchetypeChunk<ECS_TYPE> chunk, IntPredicate shouldTransfer, Consumer<Holder<ECS_TYPE>> modification, IntObjectConsumer<Ref<ECS_TYPE>> referenceConsumer)
  protected void fillEmptyIndex(int entityIndex, int lastIndex)
  public void appendDump(String prefix, StringBuilder sb)
  public String toString()

Fields:
private static final ArchetypeChunk[] EMPTY_ARRAY
protected final Store<ECS_TYPE> store
protected final Archetype<ECS_TYPE> archetype
protected int entitiesSize
protected Ref<ECS_TYPE>[] refs
protected Component<ECS_TYPE>[][] components
