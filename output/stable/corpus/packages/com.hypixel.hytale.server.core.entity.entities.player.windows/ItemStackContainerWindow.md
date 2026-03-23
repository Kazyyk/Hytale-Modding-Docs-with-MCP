# ItemStackContainerWindow

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.windows | Extends: Window | Implements: ItemContainerWindow

public class ItemStackContainerWindow extends Window implements ItemContainerWindow

## Fields

- private final JsonObject windowData
- private final ItemStackItemContainer itemStackItemContainer
- private EventRegistration eventRegistration

## Methods

- @Override @Nonnull public JsonObject getData()
- @Override public boolean onOpen0(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
- @Override public void onClose0(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Override @Nonnull public ItemContainer getItemContainer()
