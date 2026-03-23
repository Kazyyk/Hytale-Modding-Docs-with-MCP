# ReputationPlugin

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation | Extends: JavaPlugin

public class ReputationPlugin extends JavaPlugin

Plugin class that registers components, systems, and commands for the Reputation subsystem.

## Constants

- public static final int NO_REPUTATION_GROUP

## Fields

- private static ReputationPlugin instance
- private ComponentType<EntityStore, ReputationGroupComponent> reputationGroupComponentType
- private ResourceType<EntityStore, ReputationDataResource> reputationDataResourceType
- private List<ReputationRank> reputationRanks
- private int maxReputationValue
- private int minReputationValue

## Methods

- public ReputationPlugin(@Nonnull JavaPluginInit init)
- public static ReputationPlugin get()
- public ComponentType<EntityStore, ReputationGroupComponent> getReputationGroupComponentType()
- @Override protected void setup()
- @Override protected void start()
- public int changeReputation(@Nonnull Player player, @Nonnull Ref<EntityStore> npcRef, int value, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public int changeReputation(@Nonnull Player player, @Nonnull String reputationGroupId, int value, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public int changeReputation(@Nonnull World world, @Nonnull String reputationGroupId, int value)
- private int computeReputation(@Nonnull Object2IntMap<String> reputationData, @Nonnull ReputationGroup reputationGroup, int value)
- public int getReputationValue(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> playerEntityRef, @Nonnull Ref<EntityStore> npcEntityRef)
- public int getReputationValue(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> playerEntityRef, @Nonnull String reputationGroupId)
- public int getReputationValue(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> npcRef)
- public int getReputationValue(@Nonnull Store<EntityStore> store, @Nonnull String reputationGroupId)
- private int getReputationValueForGroup(@Nonnull Object2IntMap<String> reputationData, @Nonnull ReputationGroup reputationGroup)
- @Nullable public ReputationRank getReputationRank(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> npcRef)
- @Nullable public ReputationRank getReputationRank(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull String reputationGroupId)
- @Nullable public ReputationRank getReputationRankFromValue(int value)
- @Nullable public ReputationRank getReputationRank(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> npcRef)
- @Nullable public Attitude getAttitude(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> npc)
- @Nullable public Attitude getAttitude(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> npcRef)
