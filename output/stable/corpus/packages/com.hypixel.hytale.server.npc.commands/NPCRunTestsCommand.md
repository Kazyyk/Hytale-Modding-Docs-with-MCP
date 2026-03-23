# NPCRunTestsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public class NPCRunTestsCommand extends AbstractPlayerCommand

Implements `/npc runtests`. Runs a sequential NPC behavior test suite. Spawns one NPC role at a time at the player's position and waits for the tester to mark each as pass, fail, or abort. Tracks test results per role and reports a summary when all roles have been tested or the test is aborted.

Supports specifying roles via a comma-separated list or using a preset set from `NPCPlugin.getPresetCoverageTestNPCs()`. Role names can include a flock size suffix (e.g., `"Zombie#5"` to spawn a flock of 5).

## Arguments

- roles | String | conditional | Comma-separated list of role names (with optional `#flockSize` suffix)
- --preset | flag | no | Use the preset coverage test NPC list
- --pass | flag | no | Mark current NPC as passed, advance to next
- --fail | flag | no | Mark current NPC as failed, advance to next
- --abort | flag | no | Abort the test suite and report results

## Constructor


public NPCRunTestsCommand()

Registers as sub-command `"runtests"` with translation key `"server.commands.npc.runtests.desc"`.

## Inner Classes

- NPCRunTestsCommand.NPCTestData | ECS component storing test session state

## Related Types

- NPCRunTestsCommand.NPCTestData -- test session state component
- NPCCommand -- parent command collection
