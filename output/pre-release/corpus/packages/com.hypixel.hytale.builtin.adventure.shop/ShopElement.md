# ShopElement

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop | Extends: ChoiceElement

public class ShopElement extends ChoiceElement

Concrete implementation extending `ChoiceElement`.

## Fields

- cost | int | int field.
- iconPath | String | String field.

## Methods

- addButton(@Nonnull UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, String selector, PlayerRef playerRef) | void | public method.
- canFulfillRequirements(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef) | boolean | public method.

Also in this package: GiveItemInteraction, ShopAsset, ShopPage, ShopPageSupplier, ShopPlugin

Complete API:
  public void addButton(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, String selector, PlayerRef playerRef)
  public boolean canFulfillRequirements(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)

Fields:
public static final BuilderCodec<ShopElement> CODEC
protected int cost
protected String iconPath
