# ObjImportCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.objimport | Extends: AbstractPlayerCommand

public class ObjImportCommand extends AbstractPlayerCommand

Server command (`/importobj`, alias `/obj`) that opens the OBJ import UI page for the executing player. Requires Creative game mode and the `hytale.editor.selection.clipboard` permission.

## Constructor


public ObjImportCommand()

Registers the command with name `"importobj"`, alias `"obj"`, Creative permission group, and clipboard permission.

## Methods

- execute(CommandContext, Store, Ref, PlayerRef, World) | void | Opens an `ObjImportPage` for the player.

## See Also

- ObjImportPage
