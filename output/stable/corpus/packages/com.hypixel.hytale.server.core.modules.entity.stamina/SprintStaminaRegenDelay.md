# SprintStaminaRegenDelay

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.stamina | Implements: Resource<EntityStore>

public class SprintStaminaRegenDelay implements Resource<EntityStore>

Implements `Resource` to provide SprintStaminaRegenDelay functionality.

## Constants

- private static final AtomicInteger ASSET_VALIDATION_STATE

## Fields

- protected int statIndex
- protected float statValue
- protected int validationState

## Methods

- public SprintStaminaRegenDelay()
- public SprintStaminaRegenDelay(@Nonnull SprintStaminaRegenDelay other)
- public static ResourceType<EntityStore, SprintStaminaRegenDelay> getResourceType()
- public int getIndex()
- public float getValue()
- public boolean validate()
- public boolean hasDelay()
- public void markEmpty()
- public void update(int statIndex, float statValue)
- @Nonnull @Override public Resource<EntityStore> clone()
- @Nonnull @Override public String toString()
- public static void invalidateResources()

Also in this package: SprintRegenDelayConfig, SprintStaminaEffectSystem, StaminaGameplayConfig, StaminaModule, StaminaSystems

Complete API:
  public static ResourceType<EntityStore,SprintStaminaRegenDelay> getResourceType()
  public int getIndex()
  public float getValue()
  public boolean validate()
  public boolean hasDelay()
  public void markEmpty()
  public void update(int statIndex, float statValue)
  public Resource<EntityStore> clone()
  public String toString()
  public static void invalidateResources()

Fields:
private static final AtomicInteger ASSET_VALIDATION_STATE
protected int statIndex
protected float statValue
protected int validationState
