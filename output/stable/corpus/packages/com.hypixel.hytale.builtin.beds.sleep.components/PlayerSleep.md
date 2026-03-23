# PlayerSleep

Type: interface | Package: com.hypixel.hytale.builtin.beds.sleep.components

public sealed interface PlayerSleep permits PlayerSleep.FullyAwake, PlayerSleep.MorningWakeUp, PlayerSleep.NoddingOff, PlayerSleep.Slumber

Interface defining: `ofHours()`, `MorningWakeUp()`, `PlayerSomnolence()`, `plus()`....

## Methods

- MorningWakeUp(@Nullable Instant gameTimeStart) | record | public method.
- NoddingOff(Instant realTimeStart) | record | public method.
- Slumber(Instant gameTimeStart) | record | public method.

Known implementors: FullyAwake, MorningWakeUp, NoddingOff, Slumber

Also in this package: FullyAwake, MorningWakeUp, NoddingOff, PlayerSomnolence, SleepTracker, Slumber
