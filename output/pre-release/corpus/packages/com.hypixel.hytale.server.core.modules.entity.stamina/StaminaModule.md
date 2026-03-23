# StaminaModule

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.stamina | Extends: JavaPlugin

public class StaminaModule extends JavaPlugin

Plugin class that registers components, systems, and commands for the StaminaModule subsystem.

## Fields

- private static StaminaModule instance
- private ResourceType<EntityStore, SprintStaminaRegenDelay> sprintRegenDelayResourceType

## Methods

- public StaminaModule(@Nonnull JavaPluginInit init)
- @Override protected void setup()
- public ResourceType<EntityStore, SprintStaminaRegenDelay> getSprintRegenDelayResourceType()
- protected static void onGameplayConfigsLoaded(LoadedAssetsEvent<String, GameplayConfig, AssetMap<String, GameplayConfig>> event)
- public static StaminaModule get()

Also in this package: SprintRegenDelayConfig, SprintStaminaEffectSystem, SprintStaminaRegenDelay, StaminaGameplayConfig, StaminaSystems

Complete API:
  protected void setup()
  public ResourceType<EntityStore,SprintStaminaRegenDelay> getSprintRegenDelayResourceType()
  protected static void onGameplayConfigsLoaded(LoadedAssetsEvent<String,GameplayConfig,AssetMap<String,GameplayConfig>> event)
  public static StaminaModule get()

Fields:
public static final PluginManifest MANIFEST
private static StaminaModule instance
private ResourceType<EntityStore,SprintStaminaRegenDelay> sprintRegenDelayResourceType
