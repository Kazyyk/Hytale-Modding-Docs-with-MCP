# ChoiceRequirement

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages.choices

public abstract class ChoiceRequirement

Class in the choices subsystem.

## Constructors

- ChoiceRequirement() | Creates a new ChoiceRequirement instance.

## Methods

- canFulfillRequirement(@Nonnull Store<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull PlayerRef var3) | boolean | public method.
- toString() | String | public method.

Known subclasses: CanStartObjectiveRequirement, ReputationRequirement

Also in this package: ChoiceBasePage, ChoiceElement, ChoiceInteraction, ChoicePageEventData

Complete API:
  public abstract boolean canFulfillRequirement(Store<EntityStore> var1, Ref<EntityStore> var2, PlayerRef var3)
  public String toString()

Fields:
public static final CodecMapCodec<ChoiceRequirement> CODEC
public static final BuilderCodec<ChoiceRequirement> BASE_CODEC
