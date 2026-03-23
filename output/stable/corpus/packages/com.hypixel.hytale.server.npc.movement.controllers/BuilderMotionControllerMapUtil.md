# BuilderMotionControllerMapUtil

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers

public class BuilderMotionControllerMapUtil

Utility class that provides a type token for `Map<String, MotionController>`. Java generics are erased at runtime, so this class captures the concrete `Class` reference of a `HashMap<String, MotionController>` for use by the builder factory system when registering the motion controller map category.

## Fields

- CLASS_REFERENCE | Class<Map<String, MotionController>> | Captured class token for the motion controller map type

Used by BuilderMotionControllerMap in its `category()` method to return the correct class reference for factory registration.
