# AmbiencePlugin

Type: class | Package: com.hypixel.hytale.builtin.ambience | Extends: JavaPlugin

public class AmbiencePlugin extends JavaPlugin

Plugin that registers systems, commands for the builtin subsystem.

## Fields

- DEFAULT_AMBIENT_EMITTER_MODEL | String | Static final String field.
- instance | AmbiencePlugin | Static AmbiencePlugin field.
- ambienceTrackerComponentType | ComponentType<EntityStore, AmbienceTracker> | ComponentType<EntityStore, AmbienceTracker> field.
- ambientEmitterComponentType | ComponentType<EntityStore, AmbientEmitterComponent> | ComponentType<EntityStore, AmbientEmitterComponent> field.
- ambienceResourceType | ResourceType<EntityStore, AmbienceResource> | ResourceType<EntityStore, AmbienceResource> field.
- ambientEmitterModel | Model | Model field.

## Constructors

- AmbiencePlugin(@Nonnull JavaPluginInit init) | Creates a new AmbiencePlugin instance.

## Methods

- get() | AmbiencePlugin | static public method.
- setup() | void | protected method.
- start() | void | protected method.
- getAmbienceTrackerComponentType() | ComponentType<EntityStore, AmbienceTracker> | public method.
- getAmbientEmitterComponentType() | ComponentType<EntityStore, AmbientEmitterComponent> | public method.
- getAmbienceResourceType() | ResourceType<EntityStore, AmbienceResource> | public method.
- getAmbientEmitterModel() | Model | public method.
