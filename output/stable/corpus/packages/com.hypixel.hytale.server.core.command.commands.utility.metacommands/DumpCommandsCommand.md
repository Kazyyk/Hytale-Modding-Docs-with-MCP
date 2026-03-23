# DumpCommandsCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.metacommands | Extends: CommandBase

public class DumpCommandsCommand extends CommandBase

## Methods

- @Override protected void executeSync(CommandContext context)
- private List<DumpCommandsCommand.CommandDef> gatherCommandDefs()
- private void extractCommand(AbstractCommand command, List<DumpCommandsCommand.CommandDef> defs)
- private String formatNullable(T something, Function<T,String> func)
- private String formatPermission(String permission)
