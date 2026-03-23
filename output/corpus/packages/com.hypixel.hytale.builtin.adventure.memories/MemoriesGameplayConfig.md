# MemoriesGameplayConfig

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories

public class MemoriesGameplayConfig

Gameplay configuration for the memories system, loaded as a plugin config from `GameplayConfig`. Defines per-level memory thresholds, particle effects for recording memories, catch item ID, entity catch particle, and view distance for catch particles.

## Fields

- public static final String ID
- public static final BuilderCodec<MemoriesGameplayConfig> CODEC
- private int[] memoriesAmountPerLevel
- private String memoriesRecordParticles
- private String memoriesCatchItemId
- private ModelParticle memoriesCatchEntityParticle
- private int memoriesCatchParticleViewDistance

## Methods

- public static MemoriesGameplayConfig get(@Nonnull GameplayConfig config)
- public int[] getMemoriesAmountPerLevel()
- public String getMemoriesRecordParticles()
- public String getMemoriesCatchItemId()
- public ModelParticle getMemoriesCatchEntityParticle()
- public int getMemoriesCatchParticleViewDistance()
