# InstructionType

Type: enum | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: Supplier<String>

public enum InstructionType implements Supplier<String>

Defines the instruction context types in the NPC behavior tree. Used by InstructionContextHelper to validate that actions, sensors, and motions are placed in appropriate instruction slots.

## Constants

- Default | "the default behaviour instruction"` -- the main behavior tree root.
- Interaction | "the interaction instruction"` -- triggered by player/NPC interaction.
- Death | "the death instruction"` -- executed on NPC death.
- Component | "a component"` -- a reusable component reference.
- StateTransitions | "state transition actions"` -- actions triggered by state changes.

## Static Fields

- Any | EnumSet<InstructionType> | All values.
- MotionAllowedInstructions | EnumSet<InstructionType> | Default` only.
- StateChangeAllowedInstructions | EnumSet<InstructionType> | Default, Interaction, Death, Component`.

## Methods

### get


public String get()

Returns the human-readable description.

## Related Types

- InstructionContextHelper -- uses this for context validation
- ComponentContext -- the other context dimension
- BuilderSupport -- tracks the current instruction context
