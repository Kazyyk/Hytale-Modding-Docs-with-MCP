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
