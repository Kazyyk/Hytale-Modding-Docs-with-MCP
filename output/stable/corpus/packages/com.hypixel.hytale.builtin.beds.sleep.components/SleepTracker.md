# SleepTracker

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.components | Implements: Component<EntityStore>

public class SleepTracker implements Component<EntityStore>

Implementation of `Component<EntityStore>`.

## Methods

- getComponentType() | ComponentType<EntityStore, SleepTracker> | static public method.
- generatePacketToSend(@Nonnull UpdateSleepState state) | UpdateSleepState | public method.
- clone() | Component<EntityStore> | public method.

Also in this package: FullyAwake, MorningWakeUp, NoddingOff, PlayerSleep, PlayerSomnolence, Slumber

Complete API:
  public static ComponentType<EntityStore,SleepTracker> getComponentType()
  public UpdateSleepState generatePacketToSend(UpdateSleepState state)
  public Component<EntityStore> clone()

Fields:
private UpdateSleepState lastSentPacket
