# BuilderMotionControllerMap

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderBase<Map<String, MotionController>> | Implements: ISpawnable

public class BuilderMotionControllerMap extends BuilderBase<Map<String, MotionController>> implements ISpawnable

JSON builder for a named map of motion controllers. An NPC role's `BodyMotion` field is a JSON array of controller configurations. This builder reads that array, constructs each controller via its type-specific builder, and produces a `Map<String, MotionController>` keyed by the controller's type string (e.g. `"Walk"`, `"Fly"`, `"Dive"`).

The array must be non-empty (enforced by `ArrayNotEmptyValidator`).

## JSON Configuration

The JSON input is an array of motion controller objects. Each element is dispatched to the appropriate builder (BuilderMotionControllerWalk, BuilderMotionControllerFly, or BuilderMotionControllerDive) based on its `Type` field.

## Spawn Validation


public SpawnTestResult canSpawn(SpawningContext context)

Iterates over each motion controller builder and calls its `canSpawn()`. All controllers must pass for the NPC to spawn. Returns `FAIL_NO_MOTION_CONTROLLERS` if the map is empty.

## Key Methods

- Map<String, MotionController> build(BuilderSupport) | Builds and returns a `HashMap` of controllers keyed by type
- Class<Map<String, MotionController>> category() | Returns BuilderMotionControllerMapUtil`.CLASS_REFERENCE
- boolean isEnabled(ExecutionContext) | Always returns `true
- String getIdentifier() | Returns the builder's key name from `NPCPlugin.getBuilderInfo()
