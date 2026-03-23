# StartSlumberSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.world | Extends: DelayedSystem<EntityStore>

public class StartSlumberSystem extends DelayedSystem<EntityStore>

ECS system handling StartSlumber tick processing.

## Constants

- @Nonnull private static final Duration NODDING_OFF_DURATION
- @Nonnull private static final Duration WAKE_UP_AUTOSLEEP_DELAY
- private static final float SYSTEM_INTERVAL_S

## Fields

- @Nonnull private final ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType
- @Nonnull private final ResourceType<EntityStore, WorldSomnolence> worldSomnolenceResourceType
- @Nonnull private final ResourceType<EntityStore, WorldTimeResource> worldTimeResourceType

## Methods

- public StartSlumberSystem(@Nonnull ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType,
        @Nonnull ResourceType<EntityStore, WorldSomnolence> worldSomnolenceResourceType,
        @Nonnull ResourceType<EntityStore, WorldTimeResource> worldTimeResourceType)` |
| `@Override public` | `void` | `delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)` |
| `private` | `void` | `checkIfEveryoneIsReadyToSleep(@Nonnull Store<EntityStore> store)` |
| `private` | `Instant` | `computeWakeupInstant(@Nonnull Instant now, float wakeUpHour)` |
| `private static` | `float` | `computeIrlSeconds(@Nonnull Instant startInstant, @Nonnull Instant targetInstant)` |
| `private` | `boolean` | `isEveryoneReadyToSleep(@Nonnull ComponentAccessor<EntityStore> store)` |
| `public static` | `boolean` | `isReadyToSleep(@Nonnull ComponentAccessor<EntityStore> store, @Nullable Ref<EntityStore> ref)` |
| `public static` | `boolean` | `canNotifyOthersAboutTryingToSleep(@Nonnull ComponentAccessor<EntityStore> store, @Nullable Ref<EntityStore> ref)` |
