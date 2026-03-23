# ReputationGroupComponent

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation | Implements: Component<EntityStore>

public class ReputationGroupComponent implements Component<EntityStore>

An `EntityStore` component storing ReputationGroupComponent-related data on entities.

## Fields

- @Nonnull private final String reputationGroupId

## Methods

- public ReputationGroupComponent(@Nonnull String reputationGroupId)
- @Nonnull public static ComponentType<EntityStore, ReputationGroupComponent> getComponentType()
- @Nonnull public String getReputationGroupId()
- @Nonnull @Override public Component<EntityStore> clone()
