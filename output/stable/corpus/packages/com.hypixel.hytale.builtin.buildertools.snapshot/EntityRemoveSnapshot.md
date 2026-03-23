# EntityRemoveSnapshot

Type: class | Package: com.hypixel.hytale.builtin.buildertools.snapshot | Implements: EntitySnapshot<EntityAddSnapshot>

public class EntityRemoveSnapshot implements EntitySnapshot<EntityAddSnapshot>

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

- holder | Holder<EntityStore> | final Holder<EntityStore> field.

## Constructors

- EntityRemoveSnapshot(@Nonnull Ref<EntityStore> ref) | Creates a new EntityRemoveSnapshot instance.

## Methods

- getHolder() | Holder<EntityStore> | public method.
- restoreEntity(@Nonnull Player player, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | EntityAddSnapshot | public method.

Also in this package: BlockSelectionSnapshot, ClipboardBoundsSnapshot, ClipboardContentsSnapshot, EntityAddSnapshot, EntitySnapshot, EntityTransformSnapshot, SelectionSnapshot

Complete API:
  public Holder<EntityStore> getHolder()
  public EntityAddSnapshot restoreEntity(Player player, World world, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private final Holder<EntityStore> holder
