package unsw.gloriaromanus.backend;

import org.json.JSONObject;

public class TrainingRecord {
    private Unit unit;
    private int finishTurn;
    private boolean finished;

    public TrainingRecord(Unit unit, int finishTurn) {
        this.unit = unit;
        this.finishTurn = finishTurn;
        this.finished = false;
    }

    public TrainingRecord(JSONObject json) {
        this.unit = new Unit(json.getJSONObject("unit"));
        this.finishTurn = json.getInt("finishTurn");
        this.finished = json.getBoolean("finished");
    }

    public Unit getUnit() {
        return unit;
    }

    public int getFinishTurn() {
        return finishTurn;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean getFinished(){
        return finished;
    }

    public JSONObject toJSON() {
        JSONObject output = new JSONObject();
        output.put("unit", unit.toJSON());
        output.put("finishTurn", finishTurn);
        output.put("finished", finished);
        return output;
    }
    
}
