# ReputationGameplayConfig

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation

public class ReputationGameplayConfig

Configuration class for Reputation settings.

## Constants

- public static final String ID
- @Nonnull private static final ReputationGameplayConfig DEFAULT_REPUTATION_GAMEPLAY_CONFIG

## Fields

- @Nonnull protected ReputationGameplayConfig.ReputationStorageType reputationStorageType

## Methods

- @Nullable public static ReputationGameplayConfig get(@Nonnull GameplayConfig config)
- @Nonnull public static ReputationGameplayConfig getOrDefault(@Nonnull GameplayConfig config)
- @Nonnull public ReputationGameplayConfig.ReputationStorageType getReputationStorageType()
- @Nonnull @Override public String toString()

Also in this package: ReputationGroupComponent, ReputationPlugin, ReputationStorageType

Complete API:
  public static ReputationGameplayConfig get(GameplayConfig config)
  public static ReputationGameplayConfig getOrDefault(GameplayConfig config)
  public ReputationGameplayConfig.ReputationStorageType getReputationStorageType()
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<ReputationGameplayConfig> CODEC
private static final ReputationGameplayConfig DEFAULT_REPUTATION_GAMEPLAY_CONFIG
protected ReputationGameplayConfig.ReputationStorageType reputationStorageType
