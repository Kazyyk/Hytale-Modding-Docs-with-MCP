# ContainerBlockWindow

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.windows | Extends: BlockWindow | Implements: ItemContainerWindow

public class ContainerBlockWindow extends BlockWindow implements ItemContainerWindow

## Fields

- private final JsonObject windowData
- private final ItemContainer itemContainer

## Methods

- @Override @Nonnull public JsonObject getData()
- @Override public boolean onOpen0(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
- @Override public void onClose0(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Override @Nonnull public ItemContainer getItemContainer()
- @Override public void handleAction(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull WindowAction action)

Also in this package: BlockWindow, ContainerWindow, ItemContainerWindow, ItemStackContainerWindow, MaterialContainerWindow, MaterialExtraResourcesSection, ValidatedWindow, Window, WindowCloseEvent, WindowManager

Complete API:
  public JsonObject getData()
  public boolean onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)
  public void onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public ItemContainer getItemContainer()
  public void handleAction(Ref<EntityStore> ref, Store<EntityStore> store, WindowAction action)

Fields:
private final JsonObject windowData
private final ItemContainer itemContainer
