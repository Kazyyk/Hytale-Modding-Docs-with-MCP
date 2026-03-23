# ChoiceElement

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages.choices

public abstract class ChoiceElement

Class in the choices subsystem.

## Fields

- displayNameKey | String | String field.
- descriptionKey | String | String field.
- interactions | ChoiceInteraction[] | ChoiceInteraction[] field.
- requirements | ChoiceRequirement[] | ChoiceRequirement[] field.

## Constructors

- ChoiceElement(String displayNameKey, String descriptionKey, ChoiceInteraction[] interactions, ChoiceRequirement[] requirements) | Creates a new ChoiceElement instance.
- ChoiceElement() | Creates a new ChoiceElement instance.

## Methods

- getDisplayNameKey() | String | public method.
- getDescriptionKey() | String | public method.
- getInteractions() | ChoiceInteraction[] | public method.
- getRequirements() | ChoiceRequirement[] | public method.
- addButton(UICommandBuilder var1, UIEventBuilder var2, String var3, PlayerRef var4) | void | public method.
- canFulfillRequirements(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef) | boolean | public method.
- toString() | String | public method.
