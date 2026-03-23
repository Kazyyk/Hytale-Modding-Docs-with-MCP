# PlayerSomnolence

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.components | Implements: Component<EntityStore>

public class PlayerSomnolence implements Component<EntityStore>

Implementation of `Component<EntityStore>`.

## Fields

- state | PlayerSleep | PlayerSleep field.

## Constructors

- PlayerSomnolence() | Creates a new PlayerSomnolence instance.
- PlayerSomnolence(@Nonnull PlayerSleep state) | Creates a new PlayerSomnolence instance.

## Methods

- getComponentType() | ComponentType<EntityStore, PlayerSomnolence> | static public method.
- getSleepState() | PlayerSleep | public method.
- clone() | Component<EntityStore> | public method.

Also in this package: FullyAwake, MorningWakeUp, NoddingOff, PlayerSleep, SleepTracker, Slumber

Complete API:
  public static ComponentType<EntityStore,PlayerSomnolence> getComponentType()
  public PlayerSleep getSleepState()
  public Component<EntityStore> clone()

Fields:
public static PlayerSomnolence AWAKE
private PlayerSleep state
