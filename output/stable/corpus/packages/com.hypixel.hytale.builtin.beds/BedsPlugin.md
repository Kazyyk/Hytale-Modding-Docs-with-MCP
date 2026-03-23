# BedsPlugin

Type: class | Package: com.hypixel.hytale.builtin.beds | Extends: JavaPlugin

public class BedsPlugin extends JavaPlugin

## Fields

- private static BedsPlugin instance
- private ComponentType<EntityStore,PlayerSomnolence> playerSomnolenceComponentType
- private ComponentType<EntityStore,SleepTracker> sleepTrackerComponentType
- private ResourceType<EntityStore,WorldSomnolence> worldSomnolenceResourceType

## Methods

- public static BedsPlugin getInstance()
- @Override protected void setup()
- public ComponentType<EntityStore,PlayerSomnolence> getPlayerSomnolenceComponentType()
- public ComponentType<EntityStore,SleepTracker> getSleepTrackerComponentType()
- public ResourceType<EntityStore,WorldSomnolence> getWorldSomnolenceResourceType()
