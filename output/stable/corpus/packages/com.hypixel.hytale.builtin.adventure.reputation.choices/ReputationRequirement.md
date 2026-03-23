# ReputationRequirement

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation.choices | Extends: ChoiceRequirement

public class ReputationRequirement extends ChoiceRequirement

## Fields

- public static final BuilderCodec<ReputationRequirement> CODEC
- protected String reputationGroupId
- protected String minRequiredRankId

## Methods

- @Override public boolean canFulfillRequirement(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)
- @Nonnull @Override public String toString()

Complete API:
  public boolean canFulfillRequirement(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)
  public String toString()

Fields:
public static final BuilderCodec<ReputationRequirement> CODEC
protected String reputationGroupId
protected String minRequiredRankId
