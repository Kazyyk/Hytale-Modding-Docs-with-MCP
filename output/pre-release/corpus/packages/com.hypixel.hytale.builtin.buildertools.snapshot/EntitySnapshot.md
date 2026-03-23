# EntitySnapshot

Type: interface | Package: com.hypixel.hytale.builtin.buildertools.snapshot

public interface EntitySnapshot<T extends SelectionSnapshot<?>> extends SelectionSnapshot<T>

Interface defining: `restoreEntity()`, `getStore()`, `restoreEntity()`.

## Methods

- restoreEntity(@Nonnull Player var1, @Nonnull World var2, @Nonnull ComponentAccessor<EntityStore> var3) | T | package-private method.
- restore(Ref<EntityStore> ref, Player player, @Nonnull World world, ComponentAccessor<EntityStore> componentAccessor) | T | package-private method.

Known implementors: EntityAddSnapshot, EntityRemoveSnapshot, EntityTransformSnapshot

Also in this package: BlockSelectionSnapshot, ClipboardBoundsSnapshot, ClipboardContentsSnapshot, EntityAddSnapshot, EntityRemoveSnapshot, EntityTransformSnapshot, SelectionSnapshot

Complete API:
  T restoreEntity(Player var1, World var2, ComponentAccessor<EntityStore> var3)
  default T restore(Ref<EntityStore> ref, Player player, World world, ComponentAccessor<EntityStore> componentAccessor)
