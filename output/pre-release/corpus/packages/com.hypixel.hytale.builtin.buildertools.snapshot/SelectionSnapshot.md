# SelectionSnapshot

Type: interface | Package: com.hypixel.hytale.builtin.buildertools.snapshot

public interface SelectionSnapshot<T extends SelectionSnapshot<?>>

Interface defining: `restore()`.

## Methods

- restore(Ref<EntityStore> var1, Player var2, World var3, ComponentAccessor<EntityStore> var4) | T | package-private method.

Known implementors: BlockSelectionSnapshot, EntitySnapshot

Also in this package: BlockSelectionSnapshot, ClipboardBoundsSnapshot, ClipboardContentsSnapshot, EntityAddSnapshot, EntityRemoveSnapshot, EntitySnapshot, EntityTransformSnapshot

Complete API:
  T restore(Ref<EntityStore> var1, Player var2, World var3, ComponentAccessor<EntityStore> var4)
