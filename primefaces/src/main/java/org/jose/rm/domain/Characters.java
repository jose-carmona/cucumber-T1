package org.jose.rm.domain;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Characters {

@SerializedName("info")
@Expose
private Info info;
@SerializedName("results")
@Expose
private List<Character> results = null;

public Info getInfo() {
return info;
}

public void setInfo(Info info) {
this.info = info;
}

public List<Character> getResults() {
return results;
}

public void setResults(List<Character> results) {
this.results = results;
}

}
