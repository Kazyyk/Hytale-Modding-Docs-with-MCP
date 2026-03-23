# EntityAddSnapshot

Type: class | Package: com.hypixel.hytale.builtin.buildertools.snapshot | Implements: EntitySnapshot<EntityRemoveSnapshot>

public class EntityAddSnapshot implements EntitySnapshot<EntityRemoveSnapshot>

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

- entityRef | Ref<EntityStore> | final Ref<EntityStore> field.

## Constructors

- EntityAddSnapshot(Ref<EntityStore> entityRef) | Creates a new EntityAddSnapshot instance.

## Methods

- getEntityRef() | Ref<EntityStore> | public method.
- restoreEntity(@Nonnull Player player, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | EntityRemoveSnapshot | public method.

Also in this package: BlockSelectionSnapshot, ClipboardBoundsSnapshot, ClipboardContentsSnapshot, EntityRemoveSnapshot, EntitySnapshot, EntityTransformSnapshot, SelectionSnapshot

Complete API:
  public Ref<EntityStore> getEntityRef()
  public EntityRemoveSnapshot restoreEntity(Player player, World world, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private final Ref<EntityStore> entityRef
