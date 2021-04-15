package example.procedures;

import org.neo4j.logging.Log;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Procedure;

import java.util.stream.Stream;

public class Hi {
    // This gives us a log instance that outputs messages to the
    // standard log, normally found under `data/log/console.log`
    @Context
    public Log log;

    @Procedure(value = "example.procedures.hi")
    @Description("return hi (e.g. `CALL example.procedures.hi`)")
    public Stream<Output> hi() {
        Output output = new Output();
        output.out = "Hi, this was created by Marcus Chiu";
        return Stream.of(output);
    }

    public class Output {
        public String out;
    }
}
